package com.vmware.vim25;

import com.vmware.vim25.ArrayOfStaticRouteProfile;
import com.vmware.vim25.StaticRouteProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStaticRouteProfile", propOrder = {"staticRouteProfile"})
public class ArrayOfStaticRouteProfile {
  @XmlElement(name = "StaticRouteProfile")
  protected List<StaticRouteProfile> staticRouteProfile;
  
  public List<StaticRouteProfile> getStaticRouteProfile() {
    if (this.staticRouteProfile == null)
      this.staticRouteProfile = new ArrayList<>(); 
    return this.staticRouteProfile;
  }
}
