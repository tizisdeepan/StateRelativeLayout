# State Relative Layout
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)
[![](https://jitpack.io/v/tizisdeepan/staterelativelayout.svg)](https://jitpack.io/#tizisdeepan/staterelativelayout)

## What is StateRelativeLayout?
StateRelativeLayout helps you to manage between various UI states, for example, loading state, data state, error state, finish state. In architectural patterns such as the MVI pattern in android, you can use the StateRelativeLayout to maintain the state of the model by simply selecting the current state. This works perfectly with RxJava implemented in MVI pattern.
## Implementation
### [1] In your app module gradle file
```gradle
dependencies {
    implementation 'com.github.tizisdeepan:staterelativelayout:1.0.0'
}
```
### [2] In your project level gradle file
```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```
### [3] Use StateRelativeLayout in your layout.xml
```xml
<com.deepan.staterelativelayout.StateRelativeLayout
        android:id="@+id/stateManager"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
</com.deepan.staterelativelayout.StateRelativeLayout>
```
### [4] Set state for your StateRelativeLayout
```kotlin
stateManager.setState(R.id.redState)
```
Voila! You have implemented an awesome State Manager for your Android Project now!

Developed By
------------

* Deepan Elango - <tizisdeepan@gmail.com>

<a href="https://twitter.com/tizisdeepan">
  <img alt="Follow me on Twitter" src="./screenshots/twitter.png" />
</a>
<a href="https://www.linkedin.com/in/tizisdeepan/">
  <img alt="Add me to Linkedin" src="./screenshots/linkedin.png" />
</a>
