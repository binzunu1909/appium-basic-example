package_name=$1

adb shell pm grant $package_name android.permission.READ_EXTERNAL_STORAGE
adb shell pm grant $package_name android.permission.WRITE_EXTERNAL_STORAGE
adb shell pm grant $package_name android.permission.CAMERA
adb shell pm grant $package_name android.permission.ACCESS_FINE_LOCATION
adb shell pm grant $package_name android.permission.ACCESS_COARSE_LOCATION
adb shell pm grant $package_name android.permission.RECORD_AUDIO