package com.vmware.vim25;

import com.vmware.vim25.GuestRegValueDataSpec;
import com.vmware.vim25.GuestRegValueMultiStringSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueMultiStringSpec", propOrder = {"value"})
public class GuestRegValueMultiStringSpec extends GuestRegValueDataSpec {
  protected List<String> value;
  
  public List<String> getValue() {
    if (this.value == null)
      this.value = new ArrayList<>(); 
    return this.value;
  }
}
