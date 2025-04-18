Vue.component('my-hello', {
    props: ['messageList'],
    template: '<p> 123123 {{ messageList }}</p>'
});

/*
Vue.component('child-button', {
    template: '<p>안녕하세요, 부모Vue 컴포넌트입니다!</p>',
    props: ['message'],  // name이라는 prop을 부모로부터 받는다
    methods: {
        handleChildClick(message) {
            console.log("자식에게 받은 메시지:", message);
            alert("자식 컴포넌트에서 버튼 클릭!");
        }
    }
});*/
