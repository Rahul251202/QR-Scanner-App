# QR Scanner App

A QR Scanner app developed using Kotlin and XML, integrating camera functionality to scan and decode QR codes.

## Screenshots

![HomeQR](https://github.com/user-attachments/assets/48797f61-8d08-4df8-91d7-ba962d2957cd)
![Barcode](https://github.com/user-attachments/assets/8e551d6c-fa97-4460-be7d-518cf1ef4bc4)
![show result](https://github.com/user-attachments/assets/35553488-354f-4aa1-b3e9-c80f04e96012)

## Features

- Scan QR codes and barcodes using the device's camera.
- Display the scanned result on the screen.
- Designed with a clean and intuitive user interface using **XML**.
- Developed using **Kotlin** for seamless integration with Android functionalities.

## Technologies Used

- **Kotlin**: For application logic and functionality.
- **XML**: For designing the user interface.
- **Camera Functionality**: To enable QR code and barcode scanning.
- **ZXing Library**: For QR code and barcode scanning capabilities.

## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

- Android Studio
- Kotlin
- Gradle

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/Rahul251202/QR-Scanner-App.git
Open the project in Android Studio
Build and run the app on an emulator or physical device
Setup Permissions
Ensure you have the necessary permissions in your AndroidManifest.xml:
xml
Copy code
<uses-permission android:name="android.permission.CAMERA"/>
<uses-permission android:name="android.permission.INTERNET"/>
Usage
Scan QR Code: Click the 'Scan QR Code' button to open the camera and scan a QR code.
View Result: The result of the scanned QR code will be displayed on the screen.
Cancel Scan: If needed, you can cancel the scan and return to the main screen.

License
Distributed under the MIT License. See LICENSE for more information.


