package com.vmware.vim25;

import com.vmware.vim25.PatchNotApplicable;
import com.vmware.vim25.PatchSuperseded;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchSuperseded", propOrder = {"supersede"})
public class PatchSuperseded extends PatchNotApplicable {
  protected List<String> supersede;
  
  public List<String> getSupersede() {
    if (this.supersede == null)
      this.supersede = new ArrayList<>(); 
    return this.supersede;
  }
}
