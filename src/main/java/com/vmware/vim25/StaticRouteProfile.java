package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.StaticRouteProfile;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaticRouteProfile", propOrder = {"key"})
public class StaticRouteProfile extends ApplyProfile {
  protected String key;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
}
