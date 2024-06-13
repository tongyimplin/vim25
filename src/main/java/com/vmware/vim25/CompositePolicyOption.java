package com.vmware.vim25;

import com.vmware.vim25.CompositePolicyOption;
import com.vmware.vim25.PolicyOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositePolicyOption", propOrder = {"option"})
public class CompositePolicyOption extends PolicyOption {
  protected List<PolicyOption> option;
  
  public List<PolicyOption> getOption() {
    if (this.option == null)
      this.option = new ArrayList<>(); 
    return this.option;
  }
}
