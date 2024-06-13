package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.IpRouteProfile;
import com.vmware.vim25.StaticRouteProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpRouteProfile", propOrder = {"staticRoute"})
public class IpRouteProfile extends ApplyProfile {
  protected List<StaticRouteProfile> staticRoute;
  
  public List<StaticRouteProfile> getStaticRoute() {
    if (this.staticRoute == null)
      this.staticRoute = new ArrayList<>(); 
    return this.staticRoute;
  }
}
