# images-slider
Load images from a list of urls to an ImageView and auto slide by an interval of time

![](https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/slide.gif)

## Installation

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


## Example: 

```java
  private ImageView imageViewBanner;
  private ArrayList<String> imagesURLs = new ArrayList<>();
  private MainActivity mainActivity;
  private int delay = 2; // in seconds
  
  ...
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  
        mainActivity = this;
        imageViewBanner = findViewById(R.id.imageViewBanner);

        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/0.jpg");
        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/1.jpg");
        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/3.png");
        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/4.jpg");
        imagesURLs.add("https://raw.githubusercontent.com/amiarSlimane/images-slider/master/images/noblur.gif");


  	ImageSlider.slideImages(mainActivity, imagesURLs, imageViewBanner, delay);

```



