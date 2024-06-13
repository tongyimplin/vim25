package com.vmware.vim25;

import com.vmware.vim25.HostConnectFault;
import com.vmware.vim25.NonVmwareOuiMacNotSupportedHost;
import com.vmware.vim25.NotSupportedHost;
import com.vmware.vim25.NotSupportedHostForVFlash;
import com.vmware.vim25.NotSupportedHostForVmcp;
import com.vmware.vim25.NotSupportedHostForVmemFile;
import com.vmware.vim25.NotSupportedHostForVsan;
import com.vmware.vim25.NotSupportedHostInCluster;
import com.vmware.vim25.NotSupportedHostInDvs;
import com.vmware.vim25.NotSupportedHostInHACluster;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotSupportedHost", propOrder = {"productName", "productVersion"})
@XmlSeeAlso({NotSupportedHostForVmcp.class, NotSupportedHostForVFlash.class, NotSupportedHostForVmemFile.class, NotSupportedHostForVsan.class, NotSupportedHostInDvs.class, NonVmwareOuiMacNotSupportedHost.class, NotSupportedHostInCluster.class, NotSupportedHostInHACluster.class})
public class NotSupportedHost extends HostConnectFault {
  protected String productName;
  
  protected String productVersion;
  
  public String getProductName() {
    return this.productName;
  }
  
  public void setProductName(String paramString) {
    this.productName = paramString;
  }
  
  public String getProductVersion() {
    return this.productVersion;
  }
  
  public void setProductVersion(String paramString) {
    this.productVersion = paramString;
  }
}
