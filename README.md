# appium-basic-example
The **Java programming language** combined with **Appium** provides a powerful solution for creating and automating mobile applications. By leveraging Appium's capabilities, I wrote Java code to interact with the Note app's UI elements and create new notes.

The **Java programming language** combined with **Appium** provides a powerful solution for creating and automating mobile applications. By leveraging Appium's capabilities, I wrote Java code to interact with the Note app's UI elements and create new notes.

## Tools
 1. [Android Studio](https://developer.android.com/studio#:~:text=android%2Dstudio%2D2022.2.1.20%2Dmac.dmg)
2. [commandlinetools-mac-9477386_latest.zip](https://developer.android.com/studio#:~:text=commandlinetools%2Dmac%2D9477386_latest.zip)
3. [Xcode14.3.1.xip](https://developer.apple.com/download/all/?q=Xcode#:~:text=macOS%20Ventura%2013.3.-,Xcode%2014.3.1.xip,-7.01%20GB)
4. [Command Line Tools for Xcode14.3.1.dmg](https://download.developer.apple.com/Developer_Tools/Command_Line_Tools_for_Xcode_14.3.1/Command_Line_Tools_for_Xcode_14.3.1.dmg)

## For Window

- Install appium 2.x: 
`npm install -g appium@next`
[https://github.com/appium/appium](https://github.com/appium/appium)

- Install appium-uiAutomator2-driver: 
`appium driver install uiautomator2`
[https://github.com/appium/appium-uiautomator2-driver](https://github.com/appium/appium-uiautomator2-driver)

- Install Appium Inspector by downloading a version according to your OS here:  
[https://github.com/appium/appium-inspector/releases](https://github.com/appium/appium-inspector/releases)

You might need to install other things like plugins
config for appium ver2: 
**127.0.0.1 / 4723 / “/”platformName: android / automationName: uiautomator2 (for uiautomator2 driver)**

## For MacOS


The way to set up: 
  ![](https://support.smartbear.com/testcomplete/docs/_assets/commonImages/go.gif)[Set Up Appium on MacOS for Testing Android Devices](https://support.smartbear.com/testcomplete/docs/app-testing/mobile/device-cloud/configure-appium/android-on-mac.html)



  ## For Android:

- List of devices attached: 
`adb devices`

Note: The "adb devices" command is a command in the Android Debug Bridge (adb) to check the list of Android devices that have successfully connected to the computer via USB.

  
- Show appPackage/appActivity: 
`adb shell dumpsys window | grep -E 'mCurrentFocus`

Note: The command "adb shell dumpsys window | grep -E 'mCurrentFocus'" is used to retrieve information about the component currently focused in the windows system on a connected Android device.  

- Install XCuiTest: 
`appium  driver  install  xcuitest`

[https://appium.github.io/appium-xcuitest-driver/4.31/setup/](https://appium.github.io/appium-xcuitest-driver/4.31/setup/)

[https://github.com/appium/appium-xcuitest-driver](https://github.com/appium/appium-xcuitest-driver)

 platformNames: ["iOS","tvOS"] / automationName: XCUITest

  
![](https://lh3.googleusercontent.com/LXWIjijfeHkOUjfOVAZ-uxUQid5IvBjilOAJmZQIidhTI1fsiyile_d5mgzBQ5Y6FlejaiBLedYwtIuPlHfY01e9rXS3pK6eB6MOM7xTjUBn08kQB9dBSJfCfRAhJ4mYebYUix-A7Iri7fIAtcfBBzU)  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

![](https://lh4.googleusercontent.com/4zUqHPQ6403WOpkZ5ZxdfWYByf5z2yafmfnnItICvFwT3Se3rpgW54ZJSwh4TTiHVjn_rM-2KpAuZPF29ITKui9v41ri8NifBQFJR6EnL3ZljAZ-b0Adko6i1ZIL8xqU7WkfQtc9Z9UGyZS4eVWNjRo)

  

## For IOS

- Set up Enviroment in .zshrc:
```
XCODE_HOME=/Library/Developer/CommandLineTools

export PATH=$PATH:$XCODE_HOME

export PATH=$PATH:$XCODE_HOME/usr/bin

DEVELOPER_DIR="/Applications/Xcode.app/Contents/Developer/"
export DEVELOPER_DIR
```

- Use the **xcrun simctl list devices** command to list the installed iOS simulators:

`xcrun simctl list devices`

- Use the **instruments -s devices** command to list the connected iOS devices:

`instruments -s devices`

- Use the command idevice_id -l to list the connected iOS devices:

`idevice_id -l`

  

After `xcrun … list devices`, you could boot a device with its UDID (the long numbers following its name):

`xcrun simctl boot 567B6787-6282-4935-8566-921D3F54335B` (change to actual UDID)
