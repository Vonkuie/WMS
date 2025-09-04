<script>


// import {Use} from "webpack-chain";

export default {
  name: "HeaderPage",
  // computed: {
  //   Use() {
  //     return Use
  //   }
  // },

  data(){
    return {
      user: JSON.parse(sessionStorage.getItem('CurUser'))
    }
  },
  props:{
    icon:String
  },
  methods: {
    toUser() {
      console.log('to_user')

      this.$router.push("/HomePage")        //路径的正确性
    },
    logout() {
      console.log('logout')

      this.$confirm('您确定要退出登录吗？','提示',{
        confirmButtonText:'确定',
        type:'warning',
        center:true,


      })
          .then(()=>{

            this.$message({
              type:'success',
              message:'退出登录成功！'
            })
            this.$router.push("/")
            sessionStorage.clear()

          })
          .catch(()=> {
            this.$message({
              type: 'info',
              message: '已取消！'

            })
          })

    },
    collapse(){
      this.$emit('doCollapse')
    }
},
  created() {
    this.$router.push("/HomePage")
  }
}
</script>

<template>
  <div style="display: flex;">
    <div style="line-height: 60px;margin-top: 8px;">
      <i :class="icon" style="font-size: 25px;line-height: 60px;cursor: pointer;" @click="collapse"></i>
    </div>
    <div style="flex: 1;text-align:center;font-size: 34px;">
      <span>欢迎来到仓储管理系统</span>
    </div>
  <el-dropdown>
    <span>{{user.name}}</span><i class="el-icon-arrow-down" style="margin-left: 8px;"></i>
    <el-dropdown-menu slot="dropdown">

      <el-dropdown-item @click.native="toUser">个人中心</el-dropdown-item>
      <el-dropdown-item @click.native="logout">退出登录</el-dropdown-item>

    </el-dropdown-menu>
  </el-dropdown>

  </div>
</template>

<style >

</style>