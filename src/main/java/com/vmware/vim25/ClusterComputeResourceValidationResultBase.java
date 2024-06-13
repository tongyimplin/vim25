package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceDVSConfigurationValidation;
import com.vmware.vim25.ClusterComputeResourceHostConfigurationValidation;
import com.vmware.vim25.ClusterComputeResourceValidationResultBase;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceValidationResultBase", propOrder = {"info"})
@XmlSeeAlso({ClusterComputeResourceDVSConfigurationValidation.class, ClusterComputeResourceHostConfigurationValidation.class})
public class ClusterComputeResourceValidationResultBase extends DynamicData {
  protected List<LocalizableMessage> info;
  
  public List<LocalizableMessage> getInfo() {
    if (this.info == null)
      this.info = new ArrayList<>(); 
    return this.info;
  }
}
