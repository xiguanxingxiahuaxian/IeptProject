1 导入类库 
  在跟部分指定 依赖版本号 
  ext {
      compileSdkVersion = 27
      buildToolsVersion = "27.0.2"
      minSdkVersion = 18
      targetSdkVersion = 26
      supportLibraryVersion = "26.1.0"
  }
  遇坑 implementation "com.android.support:appcompat-v7:${supportLibraryVersion}"
  必须要使用 双引号
    
2  新创建项目可以 作为组件导入，修改build.gradle 与coreApp核心一样就行。 
   简单去比较一下 huadapp，shengtapp  model# IeptProject
