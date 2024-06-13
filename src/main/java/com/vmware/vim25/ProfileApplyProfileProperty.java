package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ProfileApplyProfileProperty;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileApplyProfileProperty", propOrder = {"propertyName", "array", "profile"})
public class ProfileApplyProfileProperty extends DynamicData {
  @XmlElement(required = true)
  protected String propertyName;
  
  protected boolean array;
  
  protected List<ApplyProfile> profile;
  
  public String getPropertyName() {
    return this.propertyName;
  }
  
  public void setPropertyName(String paramString) {
    this.propertyName = paramString;
  }
  
  public boolean isArray() {
    return this.array;
  }
  
  public void setArray(boolean paramBoolean) {
    this.array = paramBoolean;
  }
  
  public List<ApplyProfile> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
}
