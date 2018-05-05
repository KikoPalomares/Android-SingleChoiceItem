# Android-SingleChoiceItem
Example of single choice item on Android.

https://kikopalomares.com

```kotlin
val builderSingle = AlertDialog.Builder(this)
builderSingle.setTitle("Select")
builderSingle.setPositiveButton(getString(android.R.string.ok)) { dialog, _ -> dialog.dismiss() }
builderSingle.setSingleChoiceItems(options, defaultPosition) { _, which ->
    defaultPosition = which
    itemSelected.text = options[which]
}
builderSingle.show()
```

Puedes ver el video donde se explica como hacer este codigo:
https://www.youtube.com/watch?v=zGOVwCHCpUY
