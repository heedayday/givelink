document.addEventListener('DOMContentLoaded', function () { //vue 처리전에 html이 수행이 되는 지 속도가 안 맞아 추가함
    const app = new Vue({
        el: '#app',
        data: {
            messageList: '반영이 되는 건가 외부파일',
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
            str:'',
            ArraySet: {
                name:'은희',
                age: 31,
                email:"heecode"
            },
            ajax_code:'',
            testData:''
        },
        created(){
            $('#testInfo').text('안녕');

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

            const data = new Promise((resolve, reject) => {
                $.ajax({
                    url: '/test/testData.ajax',
                    type: 'POST',
                    data: JSON.stringify(this.ArraySet),
                    contentType: 'application/json',
                    dataType: 'json',
                    success: function (result) {
                        console.log("도착확인: "+result.ajax_code);
                        this.ajax_code = result.ajax_code;
                        this.testData = result.testData;
                        if("S" === result.ajax_code){
                            console.log("값확인:"+this.testData);
                            console.log(result.ajax_code);
                            resolve(result);
                        }else{
                            console.log(result.ajax_code);
                            reject(result);
                        }

                    },
                    error: function (data, status, err) {
                        console.error("에러 발생!");
                    },
                    complete: function () {
                        console.log("여기는 요정완료후 무조건 실행이 되는 부분이라함");
                    }
                });
                //throw new Error("에러닷"); 이게 있으면 catch 부분이 실행이 됨
            });

            data.then(v => alert("여기까지 왔잖아: "+v.testData))
                .catch(e => alert("에러인경우"));


        },
        updated(){

        },
        destroyed(){

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