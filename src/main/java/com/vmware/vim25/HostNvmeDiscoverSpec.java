package com.vmware.vim25;

import com.vmware.vim25.HostNvmeDiscoverSpec;
import com.vmware.vim25.HostNvmeSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeDiscoverSpec", propOrder = {"autoConnect"})
public class HostNvmeDiscoverSpec extends HostNvmeSpec {
  protected Boolean autoConnect;
  
  public Boolean isAutoConnect() {
    return this.autoConnect;
  }
  
  public void setAutoConnect(Boolean paramBoolean) {
    this.autoConnect = paramBoolean;
  }
}
