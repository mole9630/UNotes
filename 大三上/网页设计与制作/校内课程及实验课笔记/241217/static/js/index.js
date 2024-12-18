// 当前显示的图片索引
let currentIndex = 0;
// 获取所有图片元素
const slides = document.querySelectorAll('.carousel-inner img');
// 图片总数
const totalSlides = slides.length;

// 显示指定索引的图片
function showSlide(index) {
    if (index >= totalSlides) {
        currentIndex = 0; // 如果索引超出范围，重置为0
    } else if (index < 0) {
        currentIndex = totalSlides - 1; // 如果索引小于0，设置为最后一张图片
    } else {
        currentIndex = index; // 否则设置为指定索引
    }
    // 矫正位置并应用到图片容器
    const offset = -currentIndex * 100;
    document.querySelector('.carousel-inner').style.transform = `translateX(${offset}%)`;
}

// 自动切换到下一张图片
function nextSlide() {
    showSlide(currentIndex + 1);
}

// 根据步长切换图片
function moveSlide(step) {
    showSlide(currentIndex + step);
}

// 设置定时器
setInterval(nextSlide, 4000);

// 初始化显示第一张图片
showSlide(currentIndex);