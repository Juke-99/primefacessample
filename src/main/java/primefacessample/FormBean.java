package primefacessample;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.faces.bean.ManagedBean;

@ManagedBean
@Named
@RequestScoped
public class FormBean {
  private String text;

  public String onSubmit() {
    return "to.xhtml";
  }

  public String getText() {
    return this.text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
