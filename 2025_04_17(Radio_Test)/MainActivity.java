<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <LinearLayout
        android:id="@+id/layout"
        android:layout_width="409dp"
        android:layout_height="729dp"
        android:orientation="vertical"
        tools:layout_editor_absoluteX="1dp"
        tools:layout_editor_absoluteY="1dp"
        >

        <RadioGroup
            android:layout_width="match_parent"
            android:layout_height="match_parent" >

            <RadioButton
                android:id="@+id/radio_red"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:onClick="onRadioButtonClicked"
                android:text="RED" />

            <RadioButton
                android:id="@+id/radio_blue"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:onClick="onRadioButtonClicked"
                android:text="BLUE" />
        </RadioGroup>
    </LinearLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
