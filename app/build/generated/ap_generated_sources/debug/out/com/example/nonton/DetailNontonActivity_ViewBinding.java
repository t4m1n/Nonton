// Generated code from Butter Knife. Do not modify!
package com.example.nonton;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DetailNontonActivity_ViewBinding implements Unbinder {
  private DetailNontonActivity target;

  @UiThread
  public DetailNontonActivity_ViewBinding(DetailNontonActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailNontonActivity_ViewBinding(DetailNontonActivity target, View source) {
    this.target = target;

    target.imgPhoto = Utils.findRequiredViewAsType(source, R.id.imgphoto, "field 'imgPhoto'", ImageView.class);
    target.tvJudul = Utils.findRequiredViewAsType(source, R.id.tv_judul, "field 'tvJudul'", TextView.class);
    target.tvDeskripsi = Utils.findRequiredViewAsType(source, R.id.tv_deskripsi, "field 'tvDeskripsi'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailNontonActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgPhoto = null;
    target.tvJudul = null;
    target.tvDeskripsi = null;
  }
}
