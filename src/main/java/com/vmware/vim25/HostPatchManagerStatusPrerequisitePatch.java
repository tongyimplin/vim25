package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostPatchManagerStatusPrerequisitePatch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostPatchManagerStatusPrerequisitePatch", propOrder = {"id", "installState"})
public class HostPatchManagerStatusPrerequisitePatch extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  protected List<String> installState;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public List<String> getInstallState() {
    if (this.installState == null)
      this.installState = new ArrayList<>(); 
    return this.installState;
  }
}
