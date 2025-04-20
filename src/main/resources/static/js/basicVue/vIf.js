const vModel = new Vue({
    el: '#wrap',
    data: {
        ifData:'',
        ajaxData:'안녕하세요'
    },
    methods:{
        clickHere(data){
            this.ifData = data;
            this.vifAjax();
        },
        vifAjax(){
            alert("실행");
            $.ajax({
                url: '/test/testVo.ajax',
                type: 'POST',
                data : JSON.stringify(''),
                contentType: 'application/json',
                dataType : 'json',
                success: function (result) {
                    console.log("결과출력: "+result.name);
                    console.log("결과출력: "+result.data);
                    console.log("결과출력: "+result.moment);
                    result.list.forEach((value, index) =>
                    {
                        console.log("name결과출력: "+result.list[index].name);
                        console.log("data결과출력: "+result.list[index].data);
                        console.log("moment결과출력: "+result.list[index].moment);
                    })
                },
                error: function (data, status, err) {
                    console.error("에러 발생!");
                },
                complete: function () {
                }
            });
        }
    }

});
