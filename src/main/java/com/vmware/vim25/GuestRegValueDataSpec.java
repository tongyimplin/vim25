package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.GuestRegValueBinarySpec;
import com.vmware.vim25.GuestRegValueDwordSpec;
import com.vmware.vim25.GuestRegValueExpandStringSpec;
import com.vmware.vim25.GuestRegValueMultiStringSpec;
import com.vmware.vim25.GuestRegValueQwordSpec;
import com.vmware.vim25.GuestRegValueStringSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestRegValueDataSpec")
@XmlSeeAlso({GuestRegValueDwordSpec.class, GuestRegValueMultiStringSpec.class, GuestRegValueExpandStringSpec.class, GuestRegValueBinarySpec.class, GuestRegValueStringSpec.class, GuestRegValueQwordSpec.class})
public class GuestRegValueDataSpec extends DynamicData {}
