package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileCreateSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProfileConfigSpec;
import com.vmware.vim25.ProfileCreateSpec;
import com.vmware.vim25.ProfileSerializedCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileCreateSpec", propOrder = {"name", "annotation", "enabled"})
@XmlSeeAlso({ClusterProfileCreateSpec.class, ProfileSerializedCreateSpec.class, HostProfileConfigSpec.class})
public class ProfileCreateSpec extends DynamicData {
  protected String name;
  
  protected String annotation;
  
  protected Boolean enabled;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getAnnotation() {
    return this.annotation;
  }
  
  public void setAnnotation(String paramString) {
    this.annotation = paramString;
  }
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
}
