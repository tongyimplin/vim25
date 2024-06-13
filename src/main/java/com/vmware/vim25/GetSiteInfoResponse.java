package com.vmware.vim25;

import com.vmware.vim25.GetSiteInfoResponse;
import com.vmware.vim25.SiteInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "GetSiteInfoResponse")
public class GetSiteInfoResponse {
  @XmlElement(required = true)
  protected SiteInfo returnval;
  
  public SiteInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(SiteInfo paramSiteInfo) {
    this.returnval = paramSiteInfo;
  }
}
