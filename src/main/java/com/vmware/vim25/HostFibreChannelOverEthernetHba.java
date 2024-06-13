package com.vmware.vim25;

import com.vmware.vim25.HostFibreChannelHba;
import com.vmware.vim25.HostFibreChannelOverEthernetHba;
import com.vmware.vim25.HostFibreChannelOverEthernetHbaLinkInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFibreChannelOverEthernetHba", propOrder = {"underlyingNic", "linkInfo", "isSoftwareFcoe", "markedForRemoval"})
public class HostFibreChannelOverEthernetHba extends HostFibreChannelHba {
  @XmlElement(required = true)
  protected String underlyingNic;
  
  @XmlElement(required = true)
  protected HostFibreChannelOverEthernetHbaLinkInfo linkInfo;
  
  protected boolean isSoftwareFcoe;
  
  protected boolean markedForRemoval;
  
  public String getUnderlyingNic() {
    return this.underlyingNic;
  }
  
  public void setUnderlyingNic(String paramString) {
    this.underlyingNic = paramString;
  }
  
  public HostFibreChannelOverEthernetHbaLinkInfo getLinkInfo() {
    return this.linkInfo;
  }
  
  public void setLinkInfo(HostFibreChannelOverEthernetHbaLinkInfo paramHostFibreChannelOverEthernetHbaLinkInfo) {
    this.linkInfo = paramHostFibreChannelOverEthernetHbaLinkInfo;
  }
  
  public boolean isIsSoftwareFcoe() {
    return this.isSoftwareFcoe;
  }
  
  public void setIsSoftwareFcoe(boolean paramBoolean) {
    this.isSoftwareFcoe = paramBoolean;
  }
  
  public boolean isMarkedForRemoval() {
    return this.markedForRemoval;
  }
  
  public void setMarkedForRemoval(boolean paramBoolean) {
    this.markedForRemoval = paramBoolean;
  }
}
