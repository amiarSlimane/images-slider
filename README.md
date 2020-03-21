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
  
  ...
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  
        mainActivity = this;
        imageViewBanner = findViewById(R.id.imageViewBanner);

        imagesURLs.add("https://pixabay.com/get/5fe1d3454d51b10ff3d89938b977692b083edbed5756764c7c287e/banner-916673_640.jpg");
        imagesURLs.add("https://pixabay.com/get/54e0dd414951ad14f1dc8460825668204022dfe05b55764e702673d0/banner-2082331_640.png");
        imagesURLs.add("https://pixabay.com/get/54e8d4404e5aab14f1dc8460825668204022dfe05b55764e732f79d0/nature-2813487_640.jpg");
  	imagesURLs.add("https://pixabay.com/get/57e6dd454356af14f1dc8460825668204022dfe05b55764e70267dd5/banner-1686943_640.jpg");


  	ImageSlider.slideImages(mainActivity, imagesURLs, imageViewBanner, 2);

```

To fit the ImageView size call it inside onWindowFocusChanged

```java

  @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        ImageSlider.slideImages(mainActivity, imagesURLs, imageViewBanner, 2);
    }

```

