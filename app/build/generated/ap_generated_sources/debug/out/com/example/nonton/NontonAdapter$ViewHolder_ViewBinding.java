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

public class NontonAdapter$ViewHolder_ViewBinding implements Unbinder {
  private NontonAdapter.ViewHolder target;

  @UiThread
  public NontonAdapter$ViewHolder_ViewBinding(NontonAdapter.ViewHolder target, View source) {
    this.target = target;

    target.imgFilmList = Utils.findRequiredViewAsType(source, R.id.img_filmlist, "field 'imgFilmList'", ImageView.class);
    target.tvNamaFilm = Utils.findRequiredViewAsType(source, R.id.tv_namafilm, "field 'tvNamaFilm'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NontonAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imgFilmList = null;
    target.tvNamaFilm = null;
  }
}
