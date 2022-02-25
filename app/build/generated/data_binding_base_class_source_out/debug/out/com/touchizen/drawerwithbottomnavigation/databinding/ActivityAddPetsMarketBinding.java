// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.touchizen.drawerwithbottomnavigation.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddPetsMarketBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CircleImageView callIntentCar;

  @NonNull
  public final CircleImageView callIntentCar1;

  @NonNull
  public final CircleImageView callIntentCar2;

  @NonNull
  public final CardView catMainCard;

  @NonNull
  public final CircleImageView cats;

  @NonNull
  public final CircleImageView dog;

  @NonNull
  public final CardView dogsMainCard;

  @NonNull
  public final CircleImageView fishAndAcqurium;

  @NonNull
  public final CardView fishMainCard;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final Toolbar toolbarSearch;

  private ActivityAddPetsMarketBinding(@NonNull RelativeLayout rootView,
      @NonNull CircleImageView callIntentCar, @NonNull CircleImageView callIntentCar1,
      @NonNull CircleImageView callIntentCar2, @NonNull CardView catMainCard,
      @NonNull CircleImageView cats, @NonNull CircleImageView dog, @NonNull CardView dogsMainCard,
      @NonNull CircleImageView fishAndAcqurium, @NonNull CardView fishMainCard,
      @NonNull AppBarLayout layoutmain, @NonNull Toolbar toolbarSearch) {
    this.rootView = rootView;
    this.callIntentCar = callIntentCar;
    this.callIntentCar1 = callIntentCar1;
    this.callIntentCar2 = callIntentCar2;
    this.catMainCard = catMainCard;
    this.cats = cats;
    this.dog = dog;
    this.dogsMainCard = dogsMainCard;
    this.fishAndAcqurium = fishAndAcqurium;
    this.fishMainCard = fishMainCard;
    this.layoutmain = layoutmain;
    this.toolbarSearch = toolbarSearch;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddPetsMarketBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddPetsMarketBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_pets_market, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddPetsMarketBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.call_intent_car;
      CircleImageView callIntentCar = rootView.findViewById(id);
      if (callIntentCar == null) {
        break missingId;
      }

      id = R.id.call_intent_car1;
      CircleImageView callIntentCar1 = rootView.findViewById(id);
      if (callIntentCar1 == null) {
        break missingId;
      }

      id = R.id.call_intent_car2;
      CircleImageView callIntentCar2 = rootView.findViewById(id);
      if (callIntentCar2 == null) {
        break missingId;
      }

      id = R.id.cat_main_card;
      CardView catMainCard = rootView.findViewById(id);
      if (catMainCard == null) {
        break missingId;
      }

      id = R.id.cats;
      CircleImageView cats = rootView.findViewById(id);
      if (cats == null) {
        break missingId;
      }

      id = R.id.dog;
      CircleImageView dog = rootView.findViewById(id);
      if (dog == null) {
        break missingId;
      }

      id = R.id.dogs_main_card;
      CardView dogsMainCard = rootView.findViewById(id);
      if (dogsMainCard == null) {
        break missingId;
      }

      id = R.id.fish_and_acqurium;
      CircleImageView fishAndAcqurium = rootView.findViewById(id);
      if (fishAndAcqurium == null) {
        break missingId;
      }

      id = R.id.fish_main_card;
      CardView fishMainCard = rootView.findViewById(id);
      if (fishMainCard == null) {
        break missingId;
      }

      id = R.id.layoutmain;
      AppBarLayout layoutmain = rootView.findViewById(id);
      if (layoutmain == null) {
        break missingId;
      }

      id = R.id.toolbar_search;
      Toolbar toolbarSearch = rootView.findViewById(id);
      if (toolbarSearch == null) {
        break missingId;
      }

      return new ActivityAddPetsMarketBinding((RelativeLayout) rootView, callIntentCar,
          callIntentCar1, callIntentCar2, catMainCard, cats, dog, dogsMainCard, fishAndAcqurium,
          fishMainCard, layoutmain, toolbarSearch);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}