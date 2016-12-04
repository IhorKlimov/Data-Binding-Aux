# Data-Binding-Aux

With this library you can add those three custom attributes to any of your ImageView's: 

app:imageUrl="@{movie.posterUrl}"
app:placeholder="{@drawable/placeholder}"
app:loadListener="@{listener}"

Where listener is Glide's RequestListener

Works only with Data Binding layout variables, hardcoded image urls won't work

Add this to build.gradle depencencies:
compile 'com.myhexaville:data-binding-aux:1.0.0'

This library has a Glide dependency, current version is 3.7.0
