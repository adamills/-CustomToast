# CustomToast Utility

A lightweight helper class for Android developers to show **colored Toasts with icons** in one line of code.

## Features
- 🎨 Custom background colors
- 🖼️ Add icons easily
- ⚡ Plug-and-play, no dependencies
- 📱 Works with all Android versions

## Usage

```java
CustomToast.show(this, "Success!", Color.GREEN, R.drawable.ic_check);
CustomToast.show(this, "Error!", Color.RED, R.drawable.ic_error);
CustomToast.show(this, "Warning!", Color.YELLOW, R.drawable.ic_warning);
```

## Convenience Methods

```java
// Success Toast
CustomToast.success(this, "Operation Successful!");

// Error Toast
CustomToast.error(this, "Something went wrong!");

// Warning Toast
CustomToast.warning(this, "Please be careful!");

// Info Toast
CustomToast.info(this, "Here's some information!");
```

## Installation

1. Copy `CustomToast.java` into your project under `com/ousaf/customtoast/`
2. Add your icons to `res/drawable/`
3. Define colors in `res/values/colors.xml`
4. Import and use in your Activities

## Example

```java
Button btn = findViewById(R.id.button);
btn.setOnClickListener(v -> {
    CustomToast.show(this, "Login Successful!", Color.GREEN, R.drawable.ic_check);
});
```

## Customization

You can easily customize:
- **Colors**: Use any Android Color or resource
- **Icons**: Any drawable resource
- **Duration**: Modify toast duration in the utility
- **Text Size**: Adjust font size as needed

## License

MIT License – free to use, modify, and share.

---

Made with ❤️ by Ousaf | Contributions welcome!