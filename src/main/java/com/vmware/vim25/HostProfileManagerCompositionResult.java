package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostProfileManagerCompositionResult;
import com.vmware.vim25.HostProfileManagerCompositionResultResultElement;
import com.vmware.vim25.LocalizableMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostProfileManagerCompositionResult", propOrder = {"errors", "results"})
public class HostProfileManagerCompositionResult extends DynamicData {
  protected List<LocalizableMessage> errors;
  
  protected List<HostProfileManagerCompositionResultResultElement> results;
  
  public List<LocalizableMessage> getErrors() {
    if (this.errors == null)
      this.errors = new ArrayList<>(); 
    return this.errors;
  }
  
  public List<HostProfileManagerCompositionResultResultElement> getResults() {
    if (this.results == null)
      this.results = new ArrayList<>(); 
    return this.results;
  }
}
