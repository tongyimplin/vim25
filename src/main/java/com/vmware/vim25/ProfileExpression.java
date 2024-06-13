package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileCompositeExpression;
import com.vmware.vim25.ProfileExpression;
import com.vmware.vim25.ProfileSimpleExpression;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileExpression", propOrder = {"id", "displayName", "negated"})
@XmlSeeAlso({ProfileSimpleExpression.class, ProfileCompositeExpression.class})
public class ProfileExpression extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String displayName;
  
  protected boolean negated;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getDisplayName() {
    return this.displayName;
  }
  
  public void setDisplayName(String paramString) {
    this.displayName = paramString;
  }
  
  public boolean isNegated() {
    return this.negated;
  }
  
  public void setNegated(boolean paramBoolean) {
    this.negated = paramBoolean;
  }
}
