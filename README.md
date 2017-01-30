# Data-Binding-Aux

With this library you can add those three custom attributes to any of your ImageView's: 

```xml
app:imageUrl="@{movie.posterUrl}"
app:placeholder="{@drawable/placeholder}"
app:loadListener="@{listener}"
```


Where listener is Glide's RequestListener

Works only with Data Binding layout variables, hardcoded image urls won't work

You can setup default global disk cache strategy this way

```java
DataBindingAux.setGlobalCacheStrategy(SOURCE);
```

Add this to build.gradle depencencies:<br/>
```gradle
compile 'com.myhexaville:data-binding-aux:1.1'
```

This library has a Glide dependency, current version is 3.7.0
