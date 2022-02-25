// Generated by view binder compiler. Do not edit!
package com.touchizen.drawerwithbottomnavigation.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
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

public final class ActivityExceptedVisitorBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView autocabvisitor;

  @NonNull
  public final Button guestAdd;

  @NonNull
  public final AppBarLayout layoutmain;

  @NonNull
  public final EditText mobileNumber;

  @NonNull
  public final EditText noOfVisitor;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final Spinner simpleSpinner;

  @NonNull
  public final Toolbar toolbarSearch;

  @NonNull
  public final TextView validTill;

  @NonNull
  public final EditText visitingDate;

  @NonNull
  public final EditText visitingPurpose;

  @NonNull
  public final EditText visitingTime;

  @NonNull
  public final EditText visitorName;

  private ActivityExceptedVisitorBinding(@NonNull RelativeLayout rootView,
      @NonNull CardView autocabvisitor, @NonNull Button guestAdd, @NonNull AppBarLayout layoutmain,
      @NonNull EditText mobileNumber, @NonNull EditText noOfVisitor,
      @NonNull CircleImageView profileImage, @NonNull Spinner simpleSpinner,
      @NonNull Toolbar toolbarSearch, @NonNull TextView validTill, @NonNull EditText visitingDate,
      @NonNull EditText visitingPurpose, @NonNull EditText visitingTime,
      @NonNull EditText visitorName) {
    this.rootView = rootView;
    this.autocabvisitor = autocabvisitor;
    this.guestAdd = guestAdd;
    this.layoutmain = layoutmain;
    this.mobileNumber = mobileNumber;
    this.noOfVisitor = noOfVisitor;
    this.profileImage = profileImage;
    this.simpleSpinner = simpleSpinner;
    this.toolbarSearch = toolbarSearch;
    this.validTill = validTill;
    this.visitingDate = visitingDate;
    this.visitingPurpose = visitingPurpose;
    this.visitingTime = visitingTime;
    this.visitorName = visitorName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExceptedVisitorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExceptedVisitorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_excepted_visitor, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExceptedVisitorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.autocabvisitor;
      CardView autocabvisitor = rootView.findViewById(id);
      if (autocabvisitor == null) {
        break missingId;
      }

      id = R.id.guest_add;
      Button guestAdd = rootView.findViewById(id);
      if (guestAdd == null) {
        break missingId;
      }

      id = R.id.layoutmain;
      AppBarLayout layoutmain = rootView.findViewById(id);
      if (layoutmain == null) {
        break missingId;
      }

      id = R.id.mobile_number;
      EditText mobileNumber = rootView.findViewById(id);
      if (mobileNumber == null) {
        break missingId;
      }

      id = R.id.no_of_visitor;
      EditText noOfVisitor = rootView.findViewById(id);
      if (noOfVisitor == null) {
        break missingId;
      }

      id = R.id.profile_image;
      CircleImageView profileImage = rootView.findViewById(id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.simpleSpinner;
      Spinner simpleSpinner = rootView.findViewById(id);
      if (simpleSpinner == null) {
        break missingId;
      }

      id = R.id.toolbar_search;
      Toolbar toolbarSearch = rootView.findViewById(id);
      if (toolbarSearch == null) {
        break missingId;
      }

      id = R.id.valid_till;
      TextView validTill = rootView.findViewById(id);
      if (validTill == null) {
        break missingId;
      }

      id = R.id.visiting_date;
      EditText visitingDate = rootView.findViewById(id);
      if (visitingDate == null) {
        break missingId;
      }

      id = R.id.visiting_purpose;
      EditText visitingPurpose = rootView.findViewById(id);
      if (visitingPurpose == null) {
        break missingId;
      }

      id = R.id.visiting_Time;
      EditText visitingTime = rootView.findViewById(id);
      if (visitingTime == null) {
        break missingId;
      }

      id = R.id.visitor_name;
      EditText visitorName = rootView.findViewById(id);
      if (visitorName == null) {
        break missingId;
      }

      return new ActivityExceptedVisitorBinding((RelativeLayout) rootView, autocabvisitor, guestAdd,
          layoutmain, mobileNumber, noOfVisitor, profileImage, simpleSpinner, toolbarSearch,
          validTill, visitingDate, visitingPurpose, visitingTime, visitorName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
