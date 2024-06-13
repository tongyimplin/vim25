package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostDiskMapInfo;
import com.vmware.vim25.VsanHostDiskMapping;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostDiskMapInfo", propOrder = {"mapping", "mounted"})
public class VsanHostDiskMapInfo extends DynamicData {
  @XmlElement(required = true)
  protected VsanHostDiskMapping mapping;
  
  protected boolean mounted;
  
  public VsanHostDiskMapping getMapping() {
    return this.mapping;
  }
  
  public void setMapping(VsanHostDiskMapping paramVsanHostDiskMapping) {
    this.mapping = paramVsanHostDiskMapping;
  }
  
  public boolean isMounted() {
    return this.mounted;
  }
  
  public void setMounted(boolean paramBoolean) {
    this.mounted = paramBoolean;
  }
}
