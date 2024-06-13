package com.vmware.vim25;

import com.vmware.vim25.ClusterProfileConfigInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProfileConfigInfo;
import com.vmware.vim25.ProfileConfigInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileConfigInfo", propOrder = {"name", "annotation", "enabled"})
@XmlSeeAlso({HostProfileConfigInfo.class, ClusterProfileConfigInfo.class})
public class ProfileConfigInfo extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected String annotation;
  
  protected boolean enabled;
  
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
  
  public boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
}
