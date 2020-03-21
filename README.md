# images-slider
Load images to an ImageView and auto slide by an interval of time

![](https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/slide.gif)


Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```  
  
Add the dependency:

```gradle
dependencies {
	        implementation 'com.github.amiarSlimane:images-slider:v1.0.0'
	}
```  
Use the slider : 

```java
  ImageSlider.slideImages(final Activity activity,
      final ArrayList<String> imagesURLs,
      final ImageView imageView,
      int delaySecond)
```
