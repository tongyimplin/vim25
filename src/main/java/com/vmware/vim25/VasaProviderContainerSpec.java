package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VasaProviderContainerSpec;
import com.vmware.vim25.VimVasaProviderInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VasaProviderContainerSpec", propOrder = {"vasaProviderInfo", "scId", "deleted"})
public class VasaProviderContainerSpec extends DynamicData {
  protected List<VimVasaProviderInfo> vasaProviderInfo;
  
  @XmlElement(required = true)
  protected String scId;
  
  protected boolean deleted;
  
  public List<VimVasaProviderInfo> getVasaProviderInfo() {
    if (this.vasaProviderInfo == null)
      this.vasaProviderInfo = new ArrayList<>(); 
    return this.vasaProviderInfo;
  }
  
  public String getScId() {
    return this.scId;
  }
  
  public void setScId(String paramString) {
    this.scId = paramString;
  }
  
  public boolean isDeleted() {
    return this.deleted;
  }
  
  public void setDeleted(boolean paramBoolean) {
    this.deleted = paramBoolean;
  }
}
