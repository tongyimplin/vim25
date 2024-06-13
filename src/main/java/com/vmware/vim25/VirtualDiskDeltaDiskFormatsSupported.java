package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDiskDeltaDiskFormatsSupported;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskDeltaDiskFormatsSupported", propOrder = {"datastoreType", "deltaDiskFormat"})
public class VirtualDiskDeltaDiskFormatsSupported extends DynamicData {
  @XmlElement(required = true)
  protected String datastoreType;
  
  @XmlElement(required = true)
  protected ChoiceOption deltaDiskFormat;
  
  public String getDatastoreType() {
    return this.datastoreType;
  }
  
  public void setDatastoreType(String paramString) {
    this.datastoreType = paramString;
  }
  
  public ChoiceOption getDeltaDiskFormat() {
    return this.deltaDiskFormat;
  }
  
  public void setDeltaDiskFormat(ChoiceOption paramChoiceOption) {
    this.deltaDiskFormat = paramChoiceOption;
  }
}
