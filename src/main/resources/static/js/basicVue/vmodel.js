//document.addEventListener('DOMContentLoaded', function () {
    const vModel = new Vue({
        el: '#wrap',
        data: {
            name: '',
            email: '',
            hobby: '',
            idBoolean: false,
            idChoose: 'id',
            title:'',
            titleBoolean: true,
            gender:'F',
            genderBoolean: true,

            isChecked:'',
            subjects:[]
        },
        created() {
            this.name = 'created가 되었어';
            console.log(" 1등 created 이게 되는 지 확인중");
            //init();
        },
        methods: {
            logConsole() {
               console.log(`logConsole 이게 되는 지 확인중`);
                this.name="logConsole 실행되었음";
            },
            buttonClick(){
                alert('버튼이 눌렸음');
                this.logConsole();
                this.titleBoolean = false;
            }

        },
        mounted() {
            console.log('mounted 이게 되는 지 확인중');
            //this.logConsole(); //이런식으로 함수를 만들어두고 사용을 하면 되는 것임

        },
        watch: {
            title(){
                /*alert("확인: "+this.title); 적용이 되어 알러창이 뜸*/
            },
            titleBoolean(){
                alert("값이 변경이되면 그냥 나오는 건가 watch 부분은?")
            }
        }
    });
//});