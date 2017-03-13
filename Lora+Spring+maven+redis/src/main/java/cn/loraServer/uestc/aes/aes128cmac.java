package cn.loraServer.uestc.aes;

import java.security.NoSuchAlgorithmException;
import javax.crypto.*;

public class aes128cmac {
  private static final byte CONSTANT = (byte) 0x87;
  private static final int BLOCK_SIZE = 16;

  private int macLength;
  private Cipher aesCipher;

  private byte[] buffer;
  private int bufferCount;

  private byte[] k1;
  private byte[] k2;

  public int getMacLength() {
	return macLength;
}

public void setMacLength(int macLength) {
	this.macLength = macLength;
}

public Cipher getAesCipher() {
	return aesCipher;
}

public void setAesCipher(Cipher aesCipher) {
	this.aesCipher = aesCipher;
}

public byte[] getBuffer() {
	return buffer;
}

public void setBuffer(byte[] buffer) {
	this.buffer = buffer;
}

public int getBufferCount() {
	return bufferCount;
}

public void setBufferCount(int bufferCount) {
	this.bufferCount = bufferCount;
}

public byte[] getK1() {
	return k1;
}

public void setK1(byte[] k1) {
	this.k1 = k1;
}

public byte[] getK2() {
	return k2;
}

public void setK2(byte[] k2) {
	this.k2 = k2;
}

public static byte getConstant() {
	return CONSTANT;
}

public static int getBlockSize() {
	return BLOCK_SIZE;
}

public aes128cmac() throws NoSuchAlgorithmException {
      this(BLOCK_SIZE);
  }

  public aes128cmac(int length) throws NoSuchAlgorithmException {
      if (length > BLOCK_SIZE) {
          throw new NoSuchAlgorithmException("AES CMAC maximum length is " + BLOCK_SIZE);
      }

      try {
          macLength = length;
          aesCipher = Cipher.getInstance("AES/CBC/NOPADDING");
          buffer = new byte[BLOCK_SIZE];
      } catch (NoSuchPaddingException nspe) {
          nspe.printStackTrace();
      }
  }
}