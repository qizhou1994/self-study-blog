
描述的都是顺序排序，降序则方向操作即可
1. O(n^2)排序：  
   1. 冒泡排序
类似泡泡一样一个一个的比较交换靠向边界 把最大的元素放在最右边 复杂度n^2
   2. 选择排序
选择temp比较得到当前区域最大的数 把最大的元素放在最右边 区域逐渐变小 复杂度n^2
   3. 插入排序
选择当前的数 在左边的有序队列中找到比其大的位置 然后把这个元素放在这个 其他的元素到之前元素的位置全部平移向后一位 复杂度 n^2   

2. O(nlogn)排序：  
   ###### 1. 堆排序
      1. 根据堆（二叉树） 将最大最小元素放在堆顶 节点为n其左右孩子 就为2*n与n*2+1 
      2. 先构建堆 然后进行堆排序 将最大最小元素放到堆顶（也就是数值的第一个数 然后缩小区间 最后就得到了数列
      3. 然后过程就是不断的构建堆
      4. 初始化建堆的时间复杂度为 O(n)，重建堆的时间复杂度为 O(nlogn)，故堆排序总的时间复杂度为 O(nlogn)。
```
    public int[] heapSotr(int[] n) {
        for (int i = n.length / 2 - 1; i >= 0; i--) {
            buildDump(n, i, n.length);
        }
        for (int i = n.length - 1; i > 0; i--) {
            int t = n[i];
            n[i] = n[0];
            n[0] = t;
            buildDump(n, 0, i);
        }
        return n;
    }

    //第几个节点
    private void buildDump(int[] n, int i, int length) {
        int l = 2 * i + 1;
        int r = l + 1;
        int last = i;
        if (l < length && n[l] > n[last]) {
            last = l;
        }
        if (r < length && n[r] > n[last]) {
            last = r;
        }
        if (last != i) {
            //交换最后的数 将最大的数放在最上面
            int t = n[last];
            n[last] = n[i];
            n[i] = t;
            //再来一次判断 构建后的左右节点是否小于当前节点
            buildDump(n, last, length);
        }
    }
```

   ###### 2. 希尔排序
将数组按x间隔变成多个数列 进行排序后，然后缩小间隔再排序得到最终数列 ()
```
    public int[] sortArray(int[] nums) {

        int max = 0;
        while (max <= nums.length / 3) {
            max = max * 3 + 1;
        }
        for (int gap = max; gap >= 1; gap = (gap - 1) / 3) {
            for (int i = gap; i < nums.length; i++) {
                int preIndex = i - gap;
                int current = nums[i];
                while (preIndex >= 0 && current < nums[preIndex]) {
                    nums[preIndex + gap] = nums[preIndex];
                    preIndex = preIndex - gap;
                }
                nums[preIndex + gap] = current;
            }
        }
        return nums;
    }
```
   ###### 3. 快速排序
       1. 找到数组中的某个数值基数poivt 将比其小的放在poivt左，比其大的放在poivt右 最后再将poivt放在中间(相对)位置 
       2. 然后得到对应的中间值 然后按中间值把数列分左右两个
       3. 再排序 直到无法排位置
O(nlogn) ～ O(n^2) 平均复杂度为O(nlongn)
```
  public int[] sortArray(int[] nums) {

        quickSort1(nums, 0, nums.length - 1);
        return nums;
    }

  private void quickSort1(int[] nums, int s, int e) {
        if (s >= e) {
            return;
        }
        int middle = partition2(nums, s, e);
        quickSort1(nums, s, middle - 1);
        quickSort1(nums, middle + 1, e);
    }

    private int partition2(int[] nums, int s, int e) {
        int poivt = nums[s];
        int l = s + 1;
        int r = e;
        while (l < r) {
//比左边大 则说明有序正确左边坐标加一
            while (l < r && nums[l] <= poivt) {
                l++;
            }
//判断是否是l加到的零界点 l==r
//否则就是l这个值小于poivt 需要将这个值跟最右边的换，因为大于poivt
            if (l != r) {
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                r--;
            }
        }
//因为之前l++ r--跳出循环 当r==l这个数值未比较
        //判断一下 当零阶段的这个值是否大于poivt
        if (l == r && nums[r] > poivt) {
            r--;
        }
//r!=s 保证不是s本身  然后比r小的的一定比poivt小 所以 poivt在数列的位置一定是r
        //s是poivt的下标 最后是要将s与r交换
        if (r != s) {
            int t = nums[r];
            nums[r] = nums[s];
            nums[s] = t;
        }
        return r;
    }
```
   ###### 4. 归并排序
        1. 将一个数列切割成左右两个子数列（可循环操作）
        2. 然后合并对比排序这两个子数列得到一个数列
        3. 按这个规则 最后得到的数列就是有序数列
  
 时间复杂度O(nlogn)，空间复杂度O(n)
```
//调用mergeSort(n,0,n.length-1)
   public void mergeSort(int[] nums, int l , int r,int[] result){
        if(l == r){
            return;
        }
        int middle = (l+r)/2;
        mergeSort(nums,l,middle,result);
        mergeSort(nums,middle+1,r,result);
        merge(nums,l,r,result);
    }

    private void merge(int[] nums, int l, int r, int[] result) {

        int start1 = l;
        int end1 = (l+r)/2;
        int start2 = end1+1;
        int end2 = r;
        int resultIndex = start1;
        while (start1<=end1&&start2<=end2){
            if(nums[start1]<=nums[start2]){
                result[resultIndex++]=nums[start1++];
            }else {
                result[resultIndex++]=nums[start2++];
            }
        }

        while (start1<=end1){
            result[resultIndex++]=nums[start1++];
        }
        while (start2<=end2){
            result[resultIndex++]=nums[start2++];
        }
        for (int i = l; i <= r; i++) {
            nums[i] = result[i];
        }
    }

```

 
