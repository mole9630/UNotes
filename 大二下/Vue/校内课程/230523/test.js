//  创建Vue实例
const Vue = require('vue')
const app = new Vue({
    template: '<div>服务器端渲染实例-SRR</div>'
})

// 创建渲染实例
const renderer = require('vue-server-renderer').createRenderer()

// 将Vue实例渲染为HTML
renderer.renderToString(app, (err, html)=>{
    if(err) {
        throw err
    }
    console.log(html);
})