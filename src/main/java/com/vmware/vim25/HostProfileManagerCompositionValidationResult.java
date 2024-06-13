package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProfileManagerCompositionValidationResult;
import com.vmware.vim25.HostProfileManagerCompositionValidationResultResultElement;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileManagerCompositionValidationResult", propOrder = {"results", "errors"})
public class HostProfileManagerCompositionValidationResult extends DynamicData {
  protected List<HostProfileManagerCompositionValidationResultResultElement> results;
  
  protected List<LocalizableMessage> errors;
  
  public List<HostProfileManagerCompositionValidationResultResultElement> getResults() {
    if (this.results == null)
      this.results = new ArrayList<>(); 
    return this.results;
  }
  
  public List<LocalizableMessage> getErrors() {
    if (this.errors == null)
      this.errors = new ArrayList<>(); 
    return this.errors;
  }
}
