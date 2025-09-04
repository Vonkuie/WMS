
import VueRouter from 'vue-router';

const routes = [
    {
        path:'/',
        name:'login',
        component:()=>import('../components/LoginPage')
    },
    {
        path:'/IndexPage',
        name:'index',
        component:()=>import('../components/IndexPage'),

//子路由 跳转
        children:[
            {
                path:'/HomePage',
                name:'home',
                meta:{
                    title:'首页'
                },
                component:()=>import('../components/HomePage')
            },
            // {
            //     path:'/Admin',
            //     name:'admin',
            //     meta:{
            //         title:'管理员管理'
            //     },
            //     component:()=>import('../components/admin/AdminManage.vue')
            // },
            // {
            //     path:'/User',   //到底是UserPage 还是User
            //     name:'user',
            //     meta:{
            //         title:'用户管理'
            //     },
            //     component:()=>import('../components/user/UserManage.vue')
            // },
        ]
    }
]

const router = new VueRouter({
    mode:'history',
    routes
})


export function resetRouter() {
    router.matcher = new VueRouter({
        mode:'history',
        routes: []
    }).matcher
}
const VueRouterPush = VueRouter.prototype.push
VueRouter.prototype.push = function push (to) {
    return VueRouterPush.call(this, to).catch(err => err)
}
export  default router;