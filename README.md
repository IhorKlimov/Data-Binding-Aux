# Data-Binding-Aux

With this library you can add those three custom attributes to any of your ImageView's: 

<code>app:imageUrl="@{movie.posterUrl}"</code><br/>
<code>app:placeholder="{@drawable/placeholder}"</code><br/>
<code>app:loadListener="@{listener}"</code><br/>


Where listener is Glide's RequestListener

Works only with Data Binding layout variables, hardcoded image urls won't work

You can setup default global disk cache strategy this way

<code>DataBindingAux.setGlobalCacheStrategy(SOURCE);</code>

Add this to build.gradle depencencies:<br/>
<code>compile 'com.myhexaville:data-binding-aux:1.1'</code>

This library has a Glide dependency, current version is 3.7.0
