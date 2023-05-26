// 导入Vue和Express
const  Vue = require('vue')
const server = require('express')()

// 读取模板信息
const renderer = require('vue-server-renderer').createRenderer({
    template: require('fs').readFileSync('./template.html', 'utf-8')
})

// 处理get方式请求
server.get('*', (req, res)=>{
    res.set({
        'Content-Type': 'text/html;charset=utf-8'
    })

    const app = new Vue({
        data: {
            title: '服务器端渲染实例-SRR',
            url: req.url
        },
        template: `<div>当前访问的页面是: {{title}}<br>当前访问的URL是: {{url}}</div>`
    })
    
    // 将Vue实例渲染为HTML
    renderer.renderToString(app, (err, html)=>{
        if(err) {
            res.status(500).end('服务器内部错误: ' + err)
        }
        res.end(html)
    })
})

// 监听并启动服务
server.listen(80, ()=>{
    console.log('服务已启动')
})