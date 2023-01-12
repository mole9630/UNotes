var app = new Vue({
	el: "#app",
	data: {
		city: "",
		weatherList: [],
		msg: ""
	},
	methods: {
		// 查询天气
		searchWeather() {
			// 保存this
			const than = this;

			// 清空weatherList
			this.weatherList = [];

			// 判断是否为空
			if (this.city.trim().length != 0) {
				// 调用接口
				axios.get("https://v.api.aa1.cn/api/api-tianqi-3/index.php?msg=" + this.city + "&type=1").then((
					res) => {
					console.log(res);
					console.log(res.data.data[0].wendu);
					// 判断是否查询出数据
					if (res.data.data[0].wendu != "～") {
						// 保存天气数据
						than.weatherList = res.data.data;
						// console.log(than.weatherList);
					} else {
						alert("城市名错误, 请重试");
					}
				}, () => {
					alert("网络繁忙, 请稍后再试");
				})
			} else {
				alert("城市名不能为空");
			}
		},
		// 单击文本框下的推荐天气
		changeCity(city) {
			this.city = city;
			this.searchWeather();
		}
	}
});
