document.addEventListener('DOMContentLoaded', function () { //vue 처리전에 html이 수행이 되는 지 속도가 안 맞아 추가함
    const app = new Vue({
        el: '#app',
        data: {
            message: '반영이 되는 건가 외부파일',
            skillList: ['검정', '노랑', '초록', '하양'],
            vueDataVisible: false,
            fruits: [
                {name: "사과", color: "빨강", taste: "달콤한"},
                {name: "바나나", color: "노랑", taste: "달달한"},
                {name: "포도", color: "보라", taste: "새콤한"}
            ],
            newTodo: '',
            todos: [],
            inputChanged: false,
            str:''
        },
        created (){


        },
        methods: {
            addTodo() {
                if (this.newTodo.trim() !== '') {
                    this.todos.push({text: this.newTodo, done: false});
                    this.newTodo = '';
                }
            },
            toggleTodo(index) {
                this.todos[index].done = !this.todos[index].done;
            },
            hello(){
                return this.message='버튼이 눌렸습니다';
                this.str = JSON.stringify(fruits);
            },
            choiceFruits(){
                switch (this.fruits()){
                    case '포도':
                        console.log("포도");
                    case '딸기':
                        console.log("딸기");
                    case '수박':
                        console.log("수박");
                }
            }
        },
        computed: {
            remainingCount() {
                return this.todos.filter(todo => !todo.done).length;
            },

        },
        mounted() {
            console.log("확인");
            console.log(this.str);
        },
        watch: {
            newTodo(newVal, oldVal) {
                if (newVal !== oldVal) {
                    this.inputChanged = true;

                    // 2초 후 메시지 숨기기
                    setTimeout(() => {
                        this.inputChanged = false;
                    }, 2000);
                }
            },
            reload() {
            }
        }
    });
});