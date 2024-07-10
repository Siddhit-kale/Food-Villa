// Generated by view binder compiler. Do not edit!
package com.example.onlinemenu.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.onlinemenu.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SimpleOrderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView desc;

  @NonNull
  public final ImageView foodimage;

  @NonNull
  public final TextView foodname;

  @NonNull
  public final TextView price;

  private SimpleOrderBinding(@NonNull LinearLayout rootView, @NonNull TextView desc,
      @NonNull ImageView foodimage, @NonNull TextView foodname, @NonNull TextView price) {
    this.rootView = rootView;
    this.desc = desc;
    this.foodimage = foodimage;
    this.foodname = foodname;
    this.price = price;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SimpleOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SimpleOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.simple_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SimpleOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.desc;
      TextView desc = ViewBindings.findChildViewById(rootView, id);
      if (desc == null) {
        break missingId;
      }

      id = R.id.foodimage;
      ImageView foodimage = ViewBindings.findChildViewById(rootView, id);
      if (foodimage == null) {
        break missingId;
      }

      id = R.id.foodname;
      TextView foodname = ViewBindings.findChildViewById(rootView, id);
      if (foodname == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = ViewBindings.findChildViewById(rootView, id);
      if (price == null) {
        break missingId;
      }

      return new SimpleOrderBinding((LinearLayout) rootView, desc, foodimage, foodname, price);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}