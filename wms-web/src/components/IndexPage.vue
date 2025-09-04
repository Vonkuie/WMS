<script>


import AsidePage from "@/components/AsidePage.vue";
import HeaderPage from "@/components/HeaderPage.vue";


export default {
  name: "IndexPage",
  components: {HeaderPage, AsidePage},
  data(){
    return {
      isCollapse:false,
      aside_width:'200px',
      icon:'el-icon-s-fold'
    };
  },
methods:{
    doCollapse(){
      console.log(111)

      this.isCollapse=!this.isCollapse
      if(!this.isCollapse){//展开情况下
        this.aside_width='200px'
        this.icon='el-icon-s-fold'
      }else{//收起来的时候
        this.aside_width='64px'
        this.icon='el-icon-s-unfold'
      }
    }
}
}
</script>

<template>
  <el-container style="height: 100%; border: 1px solid #eee">
    <el-aside :width="aside_width" style="background-color: rgb(238, 241, 246);margin-left: -1px">
<AsidePage :isCollapse="isCollapse"></AsidePage>
    </el-aside>

    <el-container style="height: 100%">
      <el-header style="text-align: right; font-size: 12px;height: 100%;border-bottom: rgba(169,169,169,0.3) 1px solid;">
        <HeaderPage @doCollapse="doCollapse" :icon="icon"></HeaderPage>
      </el-header>

      <el-main style="height: 100%">
<!--        <MainPage></MainPage>-->
        <router-view/>
      </el-main>
    </el-container>
  </el-container>
</template>

<style scoped>
.el-header {
  //background-color: #B3C0D1;
  color: #333;
  line-height: 60px;
}
.el-main{
  padding: 5px;
}
.el-aside {
  color: #333;
}
</style>